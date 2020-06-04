# Spring Boot 2 dengan Multiple Database/Datasource

Datatabase yang digunakan dalam demo ini menggunakan **PostgreSQL** dan **MySQL**.
Keterangan db1 adalah PostgreSQL, db2 adalah MySQL


# Konfigurasi application.yml

    spring:  
      datasource-write:  
        driver-class-name: org.postgresql.Driver  
        jdbc-url: jdbc:postgresql://localhost:5432/demo  
        username: 'postgres'  
      password: 'root'  
      platform: postgresql  
        hikari:  
          idle-timeout: 10000  
          maximum-pool-size: 10  
          minimum-idle: 5  
          pool-name: WriteHikariPool  
      
      datasource-read:  
        driver-class-name: com.mysql.cj.jdbc.Driver  
        jdbc-url: jdbc:mysql://localhost:3306/demo?useTimezone=true&serverTimezone=UTC  
        username: 'root'  
      password: ''  
      platform: mysql  
        hikari:  
          idle-timeout: 10000  
          maximum-pool-size: 10  
          minimum-idle: 5  
          pool-name: ReadHikariPool

## Testing

Bisa menggunakan tool REST API atau dengan perintah **curl**:

 1. Menulis ke DB1

> 	 curl -H "Content-Type: application/json" --request POST --data
> '{"name":"Gobeh"}'   http://localhost:8080/mahasiswa

 2. Update DB1

>  curl -H "Content-Type: application/json" --request PUT --data
> '{"id":1 , "name":"Gobeh Lagi"}'   http://localhost:8080/mahasiswa

3. Membaca DB2
 
> curl --request GET  http://localhost:8080/mahasiswa/1

**Note:** Perlu diinput manual data mahasiswa ke DB2 karena belum dicoding.
