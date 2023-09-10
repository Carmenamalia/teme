package SDA2.Election;

public class Election {
    private Candidat candidat;
    private Candidat[] candidats;

    private int numCandidats;

    public Election(int maxNumCandidats) {
        candidats = new Candidat[maxNumCandidats];
        numCandidats = 0;
    }



    public void addCandidat(Candidat candidat) {
        if (numCandidats < candidats.length) {
            candidats[numCandidats] = candidat;
            numCandidats++;
        } else {
            System.out.println("Numărul maxim de candidați a fost atins.");
        }
    }

    //Creeaza funcția vote care:
    //
    //Primește un singur argument, name, reprezentând numele candidatului pentru care s-a votat.
    //Dacă name corespunde cu numele unui candidat, actualizează totalul de voturi al candidatului.
    //Funcția ar trebui să returneze true pentru un vot valid.
    //Dacă name nu corespunde, funcția returnează false, indicând un vot invalid.

    public boolean vote(String name) {
        //Pentru fiecare candidat în candidati
        for (int i = 0; i < candidats.length; i++) {
            if (candidats[i].getName().equals(name)) {
                candidats[i].setNumberOfVotes(candidats[i].getNumberOfVotes() + 1);
                return true;
            }
        }
        return false;
    }

    //Completează funcția declareWinner:
    //
    //Afișează numele candidatului cu cele mai multe voturi.
    //Dacă există un egalitate, afișează numele fiecărui candidat câștigător, fiecare pe o linie nouă.
    public void declareWinner() {
        int maxVotes = -1;
        String[] winners = new String[1];
        for (int i = 0; i < candidats.length; i++) {
            if (candidats[i] != null) {
                if (candidats[i].getNumberOfVotes() > maxVotes) {
                    maxVotes = candidats[i].getNumberOfVotes();
                    winners = new String[]{candidats[i].getName()};
                    winners[i] = candidats[i].getName();

                } else if (candidats[i].getNumberOfVotes() == maxVotes) {
                    String[] newWinners = new String[winners.length + 1];
                    System.arraycopy(winners, 0, newWinners, 0, winners.length);
                    newWinners[winners.length] = candidats[i].getName();
                    winners = newWinners;

                }
            }
        }
        if (winners.length == 1) {
            System.out.println("Castigatorul este: " + winners[0]);
        } else {
            System.out.println("Egalitate intre:");
            for (int i = 0; i < winners.length; i++) {
                System.out.println(winners[i]);
            }
        }
    }
}

