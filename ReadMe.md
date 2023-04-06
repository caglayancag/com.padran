### *com.TrendLifeBuy*
<h2> PROJE ISLEYIS KURALLARI </h2>
<hr>

1-Proje dili Ingilizcedir. <br>

2-Pages package'inda her collobratorun calisacagi page ayri olusturulmustur. <br>

3-Stepdefinitions'ta her collobrator kendi classinda calisacaktir. <br>
Örnegin; US05 ile baslayan page kimin ise TrendlifeBy_05 class'i onun calisma alanidir.

4-US sayisi kadar feature acilacak ve ilgili US icin Test stepleri o feature'da yazilacaktir.

5-Isimlendirmeler camelCase kuralina uygun olarak yazilacaktir. <br>

6-Locatelerin ortak isimlendirmesi su sekilde olmalidir:

    -sayfa ismi
    -locate ismi
    -locate alinan yerin turu 
    ornek: homepageLoginButtonElement
7-User login ve Admin login "utilities" package icindeki "CommonMethods" Class'indan 
"loginAsAdmin" ve "loginAsUser" methodlarina parametre olarak Configuration.properties
deki herkesin kendi kullanici bilgileri girilerek kullanilacaktir.
<hr>


## Git-Hub

<hr>
GIT-HUB COLLOBRATION KURALLARI

1- Git-Hub collabrator olusturulduktan sonra ilk is kendimize branch olusturmaktir. **Kesinlikle main branch'ta calisilmayacaktir**. <br>

2- git add . (kendi bracnh`imizde yapilir)  <br>

3- git commit -m (kendi bracnh imizde yapilir) yapilip repositories` e branch tanitilir <br>

4- Push ederken; git add yaparken dosyayolu kullanilmalidir:<br>
        --> Push edeceginiz class/feature'a sag tiklayip once copy path, sonra path from content root yolunu kopyalariz.<br>
        ornegin "src/test/resources/features/US_05.feature" <br>

5- commit yaparken **-m "tarih saat"** yazilmalidir. **"03.04.2023 23:45"** <br>

6- Mutlaka **main branchinda iken pull** edilir. Daha sonra kendi branch`ina gecip merge yapilir. **Pull isleminden baska islemler sadece kendi brancimizda** calisilir.<br>

7- Conflickt varsa

    -->conflicktleri handle et

    --> yeniden git add.

    -->git commit -m

8- Projede calismaya baslamadan once git pull yapilmalidir.(**main branch'ta iken**) <br>

9- Push yapmak isteyenler Daily Meetingten sonra telepte bulunarak push islemini kontrollu gerceklestirir. 

<hr>

