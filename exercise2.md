# Exercise 2
## Git Befehle Cheatsheet
| Comands | Description |
| ----------------- | -------------------------- |
| ``git config`` | Git config  wird dazu verwendet informationen zum Nutzer im .config file zu speichern. Ein Beispeil dafür ist ```git config --global user.name "<name>"``` um den Benutzernamen anzugeben
| ```git init``` | Dieser Befehl dient dem Erstellen eines neuen Reposortorys. Dieser Bafeh wird einmal während der einrichtung eins neuen Repositorys benutzt. Danach benögtigt man diesen nicht mehr Mit dem Befehl wird ein neues -git Unterverzeichnis und ein neuer Hauptbranch erstellt. |
|```git commit```| Zum erfassen eines Snapshots der aktuell bereitgestellten Anderungen einse Projekts. Snapshot gelten als funktionierenden sichere Versionen and den git keinen Änderungen vornimmt wenn diese nicht explizit vom User gefordert werden. Mit ```git commit -m "<Änderung>"``` kann man zusätzlich angeben was geändert wurde. Vor dem commit Befel benötigt man ```git add```. |
|```git status```| Der Befeh zeigt  den Statuts des Repositories an. Der Befehl Zeigt an welche Files noch nicht zur Stagging Area hinzugefügt werden und welche noch nicht commited worden sind.|
|```git add```| Fügt ein File zur Stagging Area hinzu. Damit werden Aktualisierungen beim nächsten commit aufgenommen. Git add hat keine Auswirkungen auf das Reposotory bis der ```git commit```  Befel ausgeführt wird.|
|```git log```| Zeigt die einzelnen Commits an die im Repository durchgeführt wurden dabei wird angezeigt wann die Änderung stattgefunden hat, was als Änderung angegeben wurden und von wem diese durchgeführt wurden bzw. wer den commit durchgeführt hat. |
|```git diff```| Der Befeh wird zum Vergleichen von 2 Git-Datenquellen verwendet. Es können einzelne commits, Branches oder Datein miteinander verglichen werden. |
|```git pull```| Mit git pull werden die Inhalte aus einem Remote-Repository heruntergeladen und das lokale Repository wir aktualisiert git pull besteht aus den zwei Befehlen ```git fetch``` und ```git merge```.  |
|```git push```| Bewirkt das Gegenteil von ```git fetch```. Es werden lokale Datein und Files in das Remote-Repository hizgefügt. Dabei ist es wichtig zu beachten das Änderungen überschrieben werden können. |
  
Link: https://www.atlassian.com/de/git/tutorials 