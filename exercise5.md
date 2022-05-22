# Execise 5
## Warum werden Logging Bibliotheken verwendet
Logging ist wichtig für development, testing und um den Ort zu finden wo Fehler passiern. Die Logs helfend den Code zu anlaysiernen und  man wird auf eventuell falsche Ergebnisse aufmerksam.
## Welche Loglevel gibt es in Log4J und was hat es damit auf sich?
Loglevel sind dafür da die einezelnen Logs zu kategorisieren.  
Level:
* all
* debug
* error
* fatal
* info
* trace
* warn
* off

## Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?
Man kann log4J mithilfe eines XML, JSON, YAML files oder eines properties format konfugurieren. Log4J kann sich während derinitialization automatisch konfigurieren. Es sucht autmatisch nach dem Konfigurations File. Fals ein soches nicht existiert dann wird Log4J im default Modus ausgeführt.