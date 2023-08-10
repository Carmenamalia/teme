package MyFitnesspalClone;


public class ProductCatalog {
    Product[] products;
    static final int maxNumberOfProducts = 100;
    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
/* Metoda nu accepta niciun parametru
Metoda nu returneaza nimic, doar printeaza in consola lista de produse
 */
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i].toString());
        }
    }

    public boolean addProduct(Product product) {
        //Metoda primeste ca parametru un produs
        //Daca produsul se afla deja in lista sau daca lista e deja plina, se va returna false (adica operatia a esuat)
        //Daca nu se afla deja in lista, se va aduga produsul in lista si se va returna true (adica operatia s-a efectuat cu success)
        //vrem sa adaugam parametrul product in "products" (this.products--linia 9)
        //apelam metoda pe un anumit obiect al lui ProductCatalog si in lista acelui obiect vrem sa adaugam produsul
        //returnam boolean cu semnificatia de daca am reusit sau nu sa adaugam un produs in lista
        //daca de ex lista e deja plina sau produsul e deja in lista  nu se poate adauga
        //daca e loc putem adauga produsul
        // performSelectedAction();
        if (getProductByName(product.name) != null || numberOfProducts == maxNumberOfProducts) {
            return false;
        } else {
            products[numberOfProducts] = product;
            numberOfProducts++;
            System.out.println("Produsul a fost adaugat");
        }
        return true;
    }

    public Product getProductByName(String name) {
/* Metoda primeste ca parametru numele unui produs
Metoda returneaza produsul din lista care are numele egal cu numele primit ca parametru
Daca produsul nu a fost gasit, se va returna null
Sugestie: pentru compararea stringurilor folositi metoda equals in loc de == (Ex: string1.equals(string2) )
 */
        if (numberOfProducts == 0) {
            return null;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            //daca numele primit e egal cu numele unui produs din lista,returnam produsul
            if (name.equals(products[i].name)) {
                return products[i];
            }
        }
        return null;
    }

    public int getProductIndexByName(String name) {
        if (numberOfProducts == 0) {
            return -1;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            //daca numele primit e egal cu numele unui produs din lista,returnam indexul
            if (name.equals(products[i].name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteProduct(String name) {
/* Metoda primeste ca parametru numele unui produs
Se va cauta produsul in lista de produse dupa nume.
Daca produsul nu a fost gasit se va returna false (adica operatia a esuat)
Altfel, produsul va fi sters din lista de produse si se va returna true (adica operatia s-a efectuat cu success)
Sugestie: operatia de cautare a unui produs dupa nume se foloseste in 2 locuri astfel ca se poate crea o metoda privata pentru a cauta produsul dupa nume in lista,
 care sa returneze indexul din array la care se afla produsul sau -1 daca nu a fost gasit
 */
        int index = getProductIndexByName(name);
        //daca nu a fost gasit se returneaza fals:
        if (index == -1) {
            return false;
        }
        for (int i = index; i < numberOfProducts-1; i++) {
            //caut produsul in lista de produse dupa nume(pot folosi getProductsByName
            //trebuie sa gasesc pozitia la care este
            //stergerea:
            //parcurg de la   pozitia aflata--- pana la nr de produse
            //mut la pozitia curenta elem de la pozitia urmatoare
            products[i] = products[i - 1];
        }
            numberOfProducts--;
            products[numberOfProducts] = null;
            return true;
    }

}
