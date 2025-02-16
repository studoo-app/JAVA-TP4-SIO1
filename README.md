![separe](https://raw.githubusercontent.com/studoo-app/.github/main/profile/studoo-banner-logo.png)
# JAVA TP4 SIO 1 - Tp Gestion de Zoo
[![Version](https://img.shields.io/badge/Version-2025-blue)]()

---

## Objectif pédagogique
Ce TP vous permettra de mettre en pratique les concepts suivants :

- Création de classes et d’attributs
- Instanciation et utilisation d’objets
- Modification d’attributs
- Parcours et gestion d’une collection d’objets
- Association entre objets (composition)
- Introduction à l’héritage (facultatif, pour aller plus loin)

## Contexte
Vous devez réaliser une application Java permettant de gérer les animaux dans un zoo. Chaque animal possède des caractéristiques spécifiques et doit être associé à un soigneur ainsi qu’à une liste d’aliments qu’il consomme.

---

## Énoncé

---

### Etape 1 : Création de la classe « Animal »

1. Créez une classe Animal contenant les attributs suivants :
    - `int id` : identifiant de l’animal
    - `String nom` : nom de l’animal
    - `int age` : âge de l’animal
    - `String espece` : espèce de l’animal
2. Ajoutez un constructeur permettant d’initialiser ces attributs. 
3. Créez une méthode `afficher()` qui affiche toutes les informations de l’animal.

---

### Etape 2 : Instanciation et affichage d’un animal

1. Dans la méthode `main`, créez un objet `Animal` (par exemple : id 1, nom "Simba", âge 5, espèce "Lion").
2. Appelez la méthode `afficher()` pour afficher les informations de cet animal.

---

### Etape 3 : Modification des informations d’un animal

1. Modifiez l’un des attributs de l’animal (par exemple, mettez à jour son âge ou changez son nom).
2. Affichez à nouveau les informations pour vérifier que la modification a bien été prise en compte.

---

### Etape 4 : Gestion d’une collection d’animaux

1. Créez plusieurs objets de type `Animal` et stockez-les dans une collection (par exemple un `ArrayList<Animal>`).
2. Parcourez la collection et affichez les informations de chaque animal en appelant la méthode `afficher()`.

---

### Etape 5 : Ajout d’un soigneur

1. Créez une classe `Soigneur` avec les attributs suivants :
   - `String prenom`
   - `String nom`
2. Ajoutez un constructeur et une méthode `afficher()` dans la classe `Soigneur`. 
3. Dans la classe `Animal`, ajoutez un attribut de type `Soigneur` (chaque animal est suivi par un soigneur). 
4. Modifiez le constructeur de `Animal` pour pouvoir associer un soigneur (vous pouvez prévoir un constructeur surchargé). 
5. Dans le `main`, créez quelques soigneurs et associez-les à vos animaux. Affichez ensuite les informations complètes de l’animal, incluant les informations du soigneur.

---

### Etape 6 : Gestion des aliments

1. Créez une classe `Aliment` avec les attributs suivants :
   - `String nom`
   - `boolean estBio` (indique si l’aliment est biologique)
2. Ajoutez un constructeur et une méthode `afficher()`. 
3. Dans la classe `Animal`, ajoutez une collection (par exemple, un `ArrayList<Aliment>`) pour stocker la liste des aliments consommés par l’animal. 
4. Créez des méthodes dans Animal pour :
   - Ajouter un aliment : `ajouterAliment(Aliment aliment)`
   - Afficher la liste complète des aliments consommés
5. Dans le `main`, pour chaque animal, ajoutez plusieurs aliments et affichez la liste des aliments ainsi que leurs informations.

