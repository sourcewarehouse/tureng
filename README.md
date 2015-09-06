# tureng

A Java API for the online Turkish-English translator [*"Tureng"*](http://tureng.com/)

**How to use:**
```java
Translator tureng = new Tureng();
Results results = tureng.translate("spit out"); // input can be in Turkish or English
results.print();
```

**Output:**
```
=============Tureng=============
en-tr:	spit out -> (General, v.) söylemek
en-tr:	spit out -> (General, v.) tükürmek
en-tr:	spit out thick wads of phlegm -> (General, v.) balgam çıkarmak
en-tr:	spit it out! -> (Colloquial) haydi söylesene!
en-tr:	get chewed up and spit out -> (Idioms) kullanılmak
en-tr:	get chewed up and spit out -> (Idioms) heba edilmek
en-tr:	get chewed up and spit out -> (Idioms) bozuk para gibi harcanmak
en-tr:	spit it out! -> (Speaking) çıkar ağzındaki baklayı
en-tr:	spit (out) one's dummy -> (British Slang) öfke nöbetine girmek
en-tr:	spit (out) one's dummy -> (British Slang) kendinden geçmek
en-tr:	spit (out) one's dummy -> (British Slang) kriz geçirmek
=============Tureng=============
```