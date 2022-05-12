# hackhathon 2022 Ostrava

## DARUJME JIDLO WEBAPP
 
### WHAT:
Webova aplikace, kde ma uzivatel moznost pridat nejakou formu daru - v tomto pripade bude darem jidlo.
 
### TYPICAL SCENARIO:
Obcas se stane, ze mame nadbytek jidla ktere sami nesnime nebo je po zaruce. Bezne se stava, ze takove jidlo vyhazujeme nebo (pri nejlepsim) nekomu podarujeme pokud mame tu moznost. Jsou potraviny ktere mohou vydrzet bez problemu po zaruce a to je take duvod, proc vznikl tento napad :)
 
Formou webu muze darce pridat libovolny potravinovy dar. Staci jenom par detailu o daru a uvest - klicove jsou cislo daru + kdy a kde se bude dar nachazet. 
Cilem projektu je tedy pomoci lidem v okoli (ci zdaleka) touto kapkou v mori. Kdokoliv si muze dar vyzvednout na miste urcenem. Pokud se sejde vice zajemcu, potom je to jenom o komunikaci mezi lidmi. Anebo je moznost dar si vyzvednout formou rezervace. Ale rad bych zvolil variantu, kdy ma k daru pristup kdokoliv (napr. bezdomovec, duchodce, proste kdokoli). Tim se zajisti, ze se dar skutecne vyuzije. 
Vyhoda webu je, ze obdarovany bude znat detaily daru (a tim padem nemusi nic zkoumat jako v pripade  tzv. "Průzkumníků")
V konecne fazi jsou 2 mozne use casy. Bud je nekdo obdarovan nebo jidlo zustane na miste a tim padem pujde do kose. V kazdem pripade nezustane na svem miste.
 
 
### TYPICAL USE CASE:
Zjistim ze mam jidlo na vyhozeni napr. po zaruce nebo je to zkratka jidlo ktere vim ze zrovna nevyuziju (mam plny mrazak, prepocital jsem se pri koupi, jede se na dovolenou, cokoliv)
Prejdu na web DarujemeJidlo a pridam darovane jidlo do systemu daru. Doplnim take misto daru a cas. A podle poctu zajemcu jidlo zanesu na prislusne misto. Pokud zajemci nejsou, tak dar muzu pozdrzet (upravim cas daru). Anebo nechat dar svemu osudu (ze nejsou zajemci na webu jeste neznamena, ze se dar nepouzije). Pochopitelne pokud se jedna o mrazene jidlo, je vhodne takovou formu daru vytvorit s moznosti rezervace. 
 
 
 
### EXAMPLE WEB FORM:
Priklad formulare (klasicky formular pro registrovane nebo anynonymni usery)
Nazev daru: Daruji brambory, mam jich prebytek a nevyuziju
Nazev jidla: brambory/ovoce/konzervy/hotove jidlo
Po zaruce: ano/ne
Druh jidla: kupovane/domaci/mrazene
Misto daru/lokace: GPS souradnice, mapka googlu nebo seznamu s adresnim radkem
Moznost rezervace: ano/ne (v tomto pripade je mozne se domluvit s darcem na miste predani a case)
Datum umisteni daru/cas: dd.mm.yyyy
 
 
### EXAMPLE WEB HOMEPAGE:
Priklad apky se seznamem daru (napr. Forma webu s HTML sablonou Card layout, kdy jednotlive dary budou videt v kartach vcetne user interface)
Nazev daru: Daruji jidlo po zaruce
Cislo daru: 8
Daruji jidlo: brambory, konzervy, sladkosti
Misto daru: Ostrava, hrabova, 
Rezervace: ano
Kdy: 1.1.2022
Mam zajem: <pocet lidi majici zajem neco jako forma Like na facebooku>
 
Dalsi priklad:
Nazev daru: Daruji jidlo po zaruce
Cislo daru: 8
Daruji jidlo: brambory, konzervy, sladkosti
Misto daru: Ostrava, hrabova, 
Rezervace: ano
Kdy: 1.1.2022
Mam zajem: <pocet lidi majici zajem neco jako forma Like na facebooku>
Optional Kde je dar vystaven: na webu/ na inzerci (muze se vystavit nekde na inzerci napr. V kauflandu) Je to jen typ rozsireni apky
 
### End pointy:
-	Seznam vsech daru
-	Seznam vsech useru registrovanych
-	Seznam vsech lokaci s dary 
-	Pridat dar, odebrat dar, upravit dar
-	Pridat Like/zajem o dar 
-	Administrace - user s admin pravy muze spravovat vsechny prispevky vcetne useru
-	Pridat oznameni o daru - status o daru napr. vyzvednuto/nevyzvednuto/vyhozeno (pokud dar byl delsi dobu nevyzvednut, prijde do kose kvuli hromadeni)
-	Pridat rezervaci daru pro usera 
-	…
 
### TOOLS, LANGUAGES, TIPS FOR CODING:
-	Angular, java, spring-boot, GPC, plugin na mapy, atd.

 General:
 - Git from https://gitforwindows.org/
 - Java from https://adoptopenjdk.net/releases.html
 - Python from https://www.python.org/downloads/windows/ 
 - Go from https://go.dev/doc/install
 
 Frontend:
 - NodeJs instalation from https://nodejs.org/en/download/ 
 - Visual Studion code from https://code.visualstudio.com/download 
 
GCP:
 - Google Cloud SDK from https://cloud.google.com/sdk/docs/install
 
 
 
 Domain darujemejidlo.cz requested in name.com
 
 http://darujemejidlo.cz/
