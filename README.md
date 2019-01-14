# Gestionale-Dungeons-Dragons
Gestionale per master di Dungeons and Dragons che permette di gestire le proprie sessioni in modo semplice e con notevoli 
risparmi di tempo.

# La schermata iniziale
![alt text](https://user-images.githubusercontent.com/46685230/51142813-34450e00-184d-11e9-87d1-e03395dc594b.png)

In questa schermata è possibile creare il proprio gruppo di avventurieri così che il programma sorteggi automaticamente 
l'iniziativa. QUI NON SI DEVONO INSERIRE I MOSTRI, ci sarà un comparto apposito dopo la configurazione dei mostri quando
ci sposteremo nella schermata principale. E' fondamentale che il nome dell'avventuriero sia una sola parola e che sia susseguito
dal suo bonus in iniziativa (fondamentale per quando verrà sorteggiata l'iniziativa). Questi Personaggi saranno attivi per tutto
il programma a differenza dei mostri successivi, che alla fine di un combattimento ovviamente verranno puliti. Questo permette
di affrontare diversi combattimenti senza dover resettare il programma. Non sarà necessario riscrivere ogni volta i dati dei Pg 
perchè il programma li salverà in un file.

# La schermata principale
![alt text](https://user-images.githubusercontent.com/46685230/51146415-08c72100-1857-11e9-8205-44f53a0d7aae.png)

La schermata principale è il vero fulcro del programma. A lato a sinistra sono presenti una serie di dadi precisamente dal dado da
2 al dado da 20 (cliccando il pulsante il risultato apparirà nei riquadri di testo laterali). La parte centrale racchiude un'area 
di testo non modificabile dove sarà riportata in seguito l'iniziativa dei Personaggi e dei Mostri. I Pg verranno ordinati per 
iniziativa in quella schermata ed in caso di iniziativa pari viene automaticamente gestita. Sotto è possibile aggiungere un
Pg per un combattimento: il pg rimarrà solo per il combattimento infatti viene utilizzato per aggiungervi i mostri. Nell'aggiunta
dei mostri è richiesta anche la vita del suddetto, visto che sarà successivamente possibile gestirlo. Il RimuoviPG serve per
rimuovere nella finestra principale un determinato Pg. N.B. se un pg di quelli iniziali verra rimosso nel primo turno verrà rimosso
per tutto il programma (ciò permette in caso di assenti di non rinconfigurare gli avventurieri base), se non serve cliccare subito
su Nuovo combattimento. Nei turni successivi gli avventurieri base rimossi verranno riaggiunti automaticamente nei combattimenti, 
i mostri no. Il tasto Nuovo Combattimento permette di incominciare un nuovo scontro risorteggiando anche tutte le iniziative, 
visibili poi cliccando su inizitiva.

# La schermata laterale
![alt text](https://user-images.githubusercontent.com/46685230/51147108-4fb61600-1859-11e9-8acd-5eb3662af7d4.png)

Una volta aggiunti i mostri appariranno a lato a destra con la loro rispettiva vita. Come si può inoltre notare ogni mostro dispone
di una sua iniziativa: ciò evita che il master muova tutti i mostri insieme. Nella barra sotto è possibile inserire il nome del
mostro e un suo cambiamento riguardante la vita. Con i tasti sottostanti e necessario specificare se il cambiamento sottrae oppure
aggiunge vita al mostro. Se la vita del mostro scende a 0 o al di sotto verrà rimosso sia dall'interfaccia a destra che in quella
dove è presente con la sua iniziativa. Cliccando Add nota si aprirà una schermata che permetterà di scrivere una nota sul mostro.

# Note
![alt text](https://user-images.githubusercontent.com/46685230/51147290-06b29180-185a-11e9-8bcc-6dd0b0efa10c.png)

La nota permette di scrivere informazioni sul mostro. Verranno salvate per la durata del combattimento, una volta finito 
eliminato anche il mostro verranno cancellate. Sono utili per ricordarsi i danni di un attacco del mostro oppure semplicemente
da chi è ingaggiato. Possono essere aperte più note in contemporanea.

# Download per Windows, Mac e Linux
1- scaricare il file .jar --> https://github.com/RootCero/Gestionale-Dungeons-Dragons/raw/master/dist/DDgestionale_1.7.jar

2- scaricare una versione di java superiore alla 8, va bene anche openJDK

3(Su Windows)- Basterà cliccare sulla sua icona salvo modifiche a java

4(Linux e MacOS)- aprire il terminale e digitare "java -jar DDgestionale_1.7.jar"

N.B. vicino al file scaricato verrà creato un file. Serve per contenere i Pg iniziali ed è possibile anche modificarlo 
manualmente.

