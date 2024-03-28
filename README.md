[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/b5ww4GXt)
# 3.Hafta Ödevi

1. Aşağıdaki kavramları örneklerle açıklayın. `(10 PUAN)`  
    • Unit test  
Unit test yazılımın en küçük birimlerini, genellikle fonksiyonları veya metotları, izole edilmiş bir şekilde test etmeyi amaçlar.
Örnek vermek gerekirse create user endpointini test etmek istediğimizde gerekli isterleri yapay bir şekilde sağlarız fonksiyonu bu verilerle test ederiz.
Fonksiyonun gerçekten database ulaşmak istediği yerleri mocklarız ve sanki databaseden başarılı çıktı almışız gibi devam ederiz. Eğer test etmek istediğimiz fonksiyon 
isterlerin önceden belirlenen sonuçlarını veriyorsa unit test başarılıdır. Bu sayede CI sürecinde eklenen yeni özelliklerin var olan davranışı bozmadığından emin oluruz.
Python'da pytest, unittest kullanırken Java'da Junit, Mockito gibi frameworkler kullanırız.
   • Integration test
Entegrasyon testi, yazılım geliştirme sürecinde farklı bileşenlerin veya modüllerin bir araya getirilip çalıştırıldığı bir test türüdür. 
Bu test, yazılımın farklı bileşenlerinin birlikte uyumlu bir şekilde çalışıp çalışmadığını kontrol etmeyi amaçlar.
Örnek olarak client'tan yapılan bir isteğin doğru bir şekilde server'a iletildiğini ve server'dan gelen yanıtın doğru bir şekilde işlendiğini integrasyon testleri sayesinde kontrol altına alırız.

2. Aşağıdaki özellikleri **kredinbizde** uygulamasına ekleyin. `(40 PUAN)`  
• Kredinbizde uygulaması için Garanti bankası için client oluşturun.  
• Kullanıcı Garanti bankası için kredi başvurusu yapabilmelidir.  
• Kullanıcı yapmış olduğu bütün başvuruları görüntüleyebilmelidir.  
• NotificationService için EMAIL,SMS,MOBILE_NOTIFICATION işlemlerini strateji pattern kullanarak implemantasyonu gerçekleştirin.  

3. Docker ile Kafka kurulumu gerçekleştirin ve exception alındığı durumlarda Kafka ile bütün loglar toplanmalı ve MongoDB üzerinde kaydedilmelidir. `(20 PUAN)`

4. Birinci ödevde yaptığınız müşteri, fatura, sipariş ve ürün ile oluşturduğunuz projenizi ayrı servisler olacak şekilde bölün ve aşağıdaki geliştirmeleri ekleyin. `(30 PUAN)`  
• GW ekleyin.  
• Discovery server ekleyin.  
• Fatura bilgilerinin asenkron oluşmasını sağlayan yapıyı kurun.  
• GlobalExceptionHandler ekleyin.  

---
*Eğitmen - Cem DIRMAN*  
*Kolay Gelsin*
