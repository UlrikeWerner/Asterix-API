#### Erstellt gemeinsam ein neues Spring Boot Projekt für eine "Asterix-API" in IntelliJ mit den Dependencies Spring Data Mongo und Spring Web.

* Definiert einen Character-Record mit den Feldern id, name, age, profession.
* Baut einen AsterixController, der bei dem Endpunkt GET /asterix/characters diese Liste zurückgibt:
return List.of(
new Character("1", "Asterix", 35, "Krieger"),
new Character("2", "Obelix", 35, "Lieferant"),
new Character("3", "Miraculix", 60, "Druide"),
new Character("4", "Majestix", 60, "Häuptling"),
new Character("5", "Troubadix", 25, "Barden"),
new Character("6", "Gutemine", 35, "Häuptlingsfrau"),
new Character("7", "Idefix", 5, "Hund"),
new Character("8", "Geriatrix", 70, "Rentner"),
new Character("9", "Automatix", 35, "Schmied"),
new Character("10", "Grockelix", 35, "Fischer")
);

* Ruft den Endpunkt mit Postman auf. Ihr solltet die Liste der Charaktere sehen.
* Nun lasst den AsterixController die Charaktere aus einer MongoDB-Datenbank laden. (Achte darauf, Deine AtlasDB-URL als Environment Variable zu setzen, damit Dein Passwort nicht auf GitHub landet!)
* Schreibe die Charakter-Daten dafür davor manuell in die Datenbank (mit Compass). Tipp: Ihr könnt ChatGPT nutzen um die Daten zu JSON umzuwandeln.
  (Nutzt gerne den Beispielcode aus dem Vortrag als Vorlage). Denkt an die Dinge, die Ihr braucht:
Die Maven-Dependency zu Spring Data MongoDB

Ein Repository-Interface, dass MongoRepository<Charakter-Record, String> implementiert

In der application.properties die MongoDB-URL (aus Umgebungsvariable) und den Datenbanknamen

Die Umgebungsvariable MONGODB_URI mit der Launch-Configuration in IntelliJ


* Wenn Du in der AtlasDB (via Compass) eine Änderung an einem Charakter vornimmst, solltet Ihr danach in Postman die geänderten Daten empfangen können.

# BONUSAUFGABEN

#### BONUS 1 - Anlegen, Ändern und Löschen
* Erweitere den AsterixController, sodass er auch POST, PUT und DELETE unterstützt.

#### BONUS 2 - Query-Parameter
* Erweitere den GET-Controller, sodass er auch Query-Parameter unterstützt um die Charaktere nach ihren Eigenschaften zu filtern.

#### BONUS 3 - Swagger SpringDoc
* Füge diese Dependency zu Deinem Projekt hinzu:

		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.2.0</version>
		</dependency>

Nach dem Neustart der Spring-Boot-Anwendung, navigiere zu http://localhost:8080/swagger-ui/index.html
Du solltest nun eine Dokumentation Deiner API sehen.

#### BONUS 4 - Custom Queries
* Ergänze einen weiteren Endpunkt, der mit einer Custom Query pro Profession das Durchschnittsalter der Charaktere dieser Profession zurückgibt.

#### BONUS 5 - Dörfer, Haustiere, Waffen
* Überlegt Euch eine immer detailliertere API für das Asterix-Universum. 
* Implementiert die API mit Spring Boot und Spring Data. Achtet dabei auf die REST-Konventionen (RFC-Dokumentation!).

