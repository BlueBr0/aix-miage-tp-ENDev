Analyse de la classe GestionException : 



Il s'agit d'une class qui regroupe 4 classes qui héritent de la classe Exception.



* Exception1
* Exception2
* Exception3
* Exception4



Le constructeur de Exception 2 prend en paramètre du constructeur "coucou" par défaut.



Le constructeur de Exception 3 prend en paramètre du constructeur une chaine de caractère.





Propriétés : 



Int => valeur



Le constructeur de GestionException prend en paramètre in int qui sera associé à la propriété valeur.



La classe possède 5 méthodes, le type de retour est void: 



Méthode1() : Renvoie une exception de type Excpetion1 si la propriété valeur est égale à 1.



Méthode2() : Renvoie une exception de type Excpetion2 si la propriété valeur est égale à 2.



Méthode3() : Renvoie une exception de type Excpetion3 si la propriété valeur est égale à 3.



Méthode4() : Renvoie une exception de type Excpetion4 si la propriété valeur est égale à 1.



Méthode5() : Renvoie une exception de type Excpetion1.



faire() :



=> Affiche la Valeur

=> Dans un try / catch :

&nbsp;	=> Teste les méthodes suivantes : 

&nbsp;		Méthode1()

&nbsp;		Méthode2()

&nbsp;		Méthode3()

&nbsp;		Méthode4()

&nbsp;		Méthode5()

&nbsp;	=> Si un exception est levée, elle est récupéré par un catch correspondant

&nbsp;	=> Si L'exception est Exception1

&nbsp;		Renvoie le message "recuperation de Exception1" + e

&nbsp;	=> Si L'exception est Exception2

&nbsp;		Renvoie le message "recuperation de Exception2" + "coucou"

&nbsp;	=> Si L'exception est Exception3 ou Exception 4

 		Renvoie le message "recuperation de Exception3 ou 4" + e

&nbsp;	=> Si L'exception est une Exception (SuperClass) + e => Si c'est une Exception3 => Affiche le msg passé en paramètre.

&nbsp;		Renvoie le message "code jamais atteint"

=> Dans le finally du try / catch

&nbsp;	Affiche "Finally"



Si aucune exception est levée la console va afficher : 

Méthode1

Méthode2

Méthode3

Méthode4

Méthode5

Finally











