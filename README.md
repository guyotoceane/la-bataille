# la-bataille
Jeu de carte "la bataille" dans le cadre du cours Java/UPMC

Instructions
============

Le jeu se compile avec la commande `mvn compile`.

Vous pouvez lancer une partie avec `mvn exec:java -Dexec.mainClass="upmc.game.Bataille"`


Règles du jeu
=============
Chaque joueur se voit attribuer un tas de carte (représenté par un tableau). 
* Le premier joueur va choisir de jouer seul ou contre un ordinateur
* Si il y a deux joueurs réèls il est possible d'insérer un fichier avec le nom des joueurs (un par ligne) // fichier equipe1.txt
* A chaque tour le (ou les) joueurs vont devoir choisir entre tirer une carte ou quitter le jeu (l'ordinateur choisi d'office de tirer une carte)
* La personne qui a la carte la plus grosse remporte le point
* En cas d'égalité de valeur (soit bataille), les cartes sont remises en jeu
* Le premier joueur à avoir 100 points remporte la partie
* Si la partie est arrêté avant la fin c'est le joueur avec le plus de carte qui remporte la partie
* La plus petite carte est le 1 et la plus grosse est le roi / Le jeu et composé de 52 cartes.

# la-bataille
Jeu de carte "la bataille" dans le cadre du cours Java/UPMC

Instructions
============

Le jeu se compile avec la commande `mvn compile`.

Vous pouvez lancer une partie avec `mvn exec:java -Dexec.mainClass="upmc.game.Bataille"`

TP 1
====

* Le début de l'énoncé du TP se trouve à la fin du cours 1
* En plus, on vous demande de proposer un mode interactif dans lequel :
  1. Le système indique quelle joueur doit jouer.
  2. L'utilisateur peut décider de tirer une carte (simplement en appuyant sur "enter").
* Proposer un menu à 2 entrées : (1) Tirer la prochaine carte (2) Quitter.
* Permettez aux deux joueurs d'entrer leurs noms.
* Proposer un mode où un joueur peut jouer contre un ordinateur.
* Rendre le projet le plus ergonomique et soigné possible.
* Étendez les règles à votre sauce pour rendre le tout plus intéressant.
* Faites un rapport d'une page maximum pour expliquer les nouvelles règles implémentées.
* Veuillez à respecter la grille d'évaluation.

La date de rendu est sur le [site du cours](hyc.io/teaching/java.html).

TP 2
====

* Lire l'interface `LecturePseudo` pour lire le pseudo d'un joueur.
* Implémenter cette interface avec `LectureConsole` et `LectureFichier` pour lire les pseudos d'un fichier et de la console.
* Ajouter une classe `MenuPseudo` qui propose une méthode `public LecturePseudo lirePseudo()` qui va demander proposer un menu pour que l'utilisateur puisse choisir de quelles manières il veut lire les pseudos et renvoyer la classe correspondante.
* Utiliser `MenuPseudo` dans votre méthode `main` principale.

La date de rendu est sur le [site du cours](hyc.io/teaching/java.html).

Info
====

Synchroniser un fork avec son répertoire courant:

```
git remote add upstream https://github.com/ptal/la-bataille.git
git fetch upstream
git checkout master
git merge upstream/master
```
Source: [synchroniser un fork](https://help.github.com/articles/syncing-a-fork/)

