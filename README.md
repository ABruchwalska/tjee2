# tjee2 - projekt 2.


    przechodzimy do folderu z projektem
    nadajemy sobie uprawnienia do uruchamiania skryptów:
    chmod 755 ./scripts/*.sh
    ściągnij ze strony https://glassfish.java.net/downloads/3.1.2.2-final.html i zainstaluj GlassFish (początkowo w folderze scripts utwórz folder o nazwie "glassfish3" następnie uruchom skrypt wypakowujący wszystkie pliki GlassFish-a do folderu "glassfish3"):
    mkdir scripts/glassfish3
    uruchamiamy serwer:
    ./scripts/uruchomSerwer.sh
    uruchamiamy bazę danych (opcjonalne, ale zalecane):
    ./scripts/uruchomBaze.sh
    jeśli jest uruchomiony zatrzymaj GlassFish'a:
    ./scripts/zatrzymajGlassFish.sh
    skopiuj hsqldb-2.2.4.jar do biblioteki GlassFis'a:
    cp ./scripts/hsqldb-2.2.4.jar scripts/glassfish3/glassfish/domains/domain1/lib/ext/.
    zmieniamy konfigurcje pliku domain.xml w GlassFish'u:
    vi scripts/glassfish3/glassfish/domains/domain1/config/domain.xml
    szukamy <resources>. kopiuj/wklej poniższy <jdbc-connection-pool> w miejsce <resources>:
    <jdbc-connection-pool driver-classname="" datasource-classname="org.hsqldb.jdbc.JDBCDataSource" res-type="javax.sql.DataSource" description="" name="HSQLPool" ping="true">
    <property name="DatabaseName" value="jdbc:hsqldb:hsql://localhost/workdb">
    </property>
    <property name="User" value="SA">
    </property>
    <property name="Password" value="">
    </property>
    <property name="connectionAttributes" value=";ifexists=true">
    </property>
    </jdbc-connection-pool>
    <jdbc-resource pool-name="HSQLPool" description="DataSource for demo apps with HSQLDB" jndi-name="jdbc/demoapps">
    </jdbc-resource>
    uruchom GlassFish
    ./scripts/uruchomGlassFish.sh
    przejdź do panelu:
    http://localhost:4848
    kliknij na: Resources/JDBC/JDBC Connection Pools/HSQLPool
    kliknij na Ping, musi zakończyć się sukcesem
    przejdź do panelu:
    http://localhost:4848
    kliknij: Update Tool
    zaznacz: Hibernate
    kliknij: install
    po zakończeniu instalacji zrestartuj GlassFish'a:
    ./scripts/restartujGlassFish.sh
    tworzymy naszą webową stronę:
    ./scripts/zbudujStrone.sh
    przechodzimy do panelu:
    http://localhost:4848
    kliknij na: Applications
    sprawdzamy czy został dodany: ksiegarnia, jeśli tak klikamy przy nim na: Launch (kolumna Action)
    kliknij na pierwszy odnośnik

