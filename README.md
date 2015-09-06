# tureng

A Java API for the online Turkish-English translator "Tureng"

* `en-tr` and `tr-en` translations are retrieved from [*Tureng*](http://tureng.com/) and [*Zargan*](http://www2.zargan.com/).
* `en-en` definitions are retrieved from [*Sozluk.Net*](http://www.sozluk.net/) and [*Babylon*](http://www.babylon.com/).
* `tr-tr` definitions are retrieved from [*Sozluk.Net*](http://www.sozluk.net/).

**How to use - Tureng:**
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