# Подсказка на обновление версии 
# При обновлении репозитория 
необходимо обновить версию этой зависимости в проекте в pom.xml

<dependency>
    <groupId>com.github.KukeiAMG</groupId>
    <artifactId>SharedKafka</artifactId>
    <version>-c1b4269390-1</version> <- вот здесь надо изменить версию 
    <scope>compile</scope>
</dependency>

# Как менять?
<version>-c1b4269390-1</version>
код версии состоит из -"первые 10 символов HashCode коммита"-1

# Откуда взять HashCode коммита?
1) заходишь в репозиторий SharedKafka
2) нажимаешь на кнопочку Commits
3) справа от каждого коммита есть значок копирования (он скопирует весь HashCode нам нужно взять только первые 10 символов)
