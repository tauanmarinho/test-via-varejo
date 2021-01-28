# test-via-varejo

Escolha a linguagem de programação de sua preferência para automatizar o fluxo abaixo:  

Funcionalidade: Pesquisa com o QA 
Como um recrutador
Quero colher dados da pesquisa 
Para fazer análises mais detalhadas do QA
 
Link: https://bit.ly/3jOMrR9
 
Cenário: Preencher pesquisa com dados obrigatórios válidos
Dado que eu acesse a página da VV Test
E acesse o menu "Pesquisa - QA"
Quando eu preencher todos os campos obrigatórios 
Então deve ser direcionado para uma página de sucesso

Instruções: Após desenvolver a automação, suba o projeto no GitHub (público), COPIE e COLE o link aqui.

DICAS ÚTEIS:
1- Reserve um tempo para fazer a automação, pois boas práticas serão consideradas.
2- Primeiramente, crie o repositório e já cole aqui para não correr o risco de sua internet ficar instável e perder a sessão.
3- Após salvar o repositório do github aqui, salve a questão e guarde o link final. Este link será enviado para o recrutador.
4- Qualquer problema entre em contato com o recrutador. Nosso time estará a disposição para tirar dúvidas.

Boa sorte!!!

## Description

- Test Framework in Java/Maven that runs a suite of selenium test, target https://bit.ly/3jOMrR9 web page, that ensure the search form page is working as expected.

- For this approach, some concepts and open-source testing framework were used to complete.

- Framework created:
    - Validate form page Via Varejo
    - Total of methods test: 1
        - Form validation test: 1 iterations
        - Total of tests: 1
    - Expected result: 100% pass - 0% fail

- Stack tech used:

    - [Zalenium](https://github.com/zalando/zalenium): A flexible and scalable container based Selenium Grid. Where it's possible to make video recording, live preview and a great dashboard;
    - [TestNG](https://testng.org/doc/TestNG): Very well-known and used java framework for testing. Making your testing code more powerful and easier to use;
    - [Docker](https://www.docker.com): Container deployment tool, packaging software into standardized units for deployment or in this case of project testing;
    - [Selenium WebDriver](https://www.selenium.dev): Framework for automate browsers in a simple way;
    - [GibHub](https://github.com): This amazing platform to share, code integration, hostage, deployment and so on;
    - [Git](https://git-scm.com): The most used free and open source distributed version control;
    - [Maven](https://maven.apache.org): Software project management tool.
    
## Usage

- Before running:
    
    - Docker installed
    - Run the Zalenium Grid Frame on port 5555:
        ```bash
        docker run --rm -ti --name zalenium -p 5555:4444 -e PULL_SELENIUM_IMAGE=true -v /var/run/docker.sock:/var/run/docker.sock -v /tmp/videos:/home/seluser/videos --privileged dosel/zalenium start
        ```
        or simply run the docker compose:
        ```bash
        docker-compose -f docker-compose.yml up
        ```
    - Find your local ip by:
            - MacOs/Linux: ifconfig
            - Windows: ipconfig

- Run locally:

    - Java 8+ SDK installed
    - Maven installed
    
    Inside of the project folder, by command line, run the following command replacing <your_local_ip_address> by you local ip address and <browser_type> by chrome or firefox:

    ```bash
    mvn clean test -Dbrowser=<browser_type> -DlocalIpAddress=<your_local_ip_address> -Pviavarejo
    ```
   
- Run in a docker container:

    On the Dockerfile, replace <your_local_ip_address> by you local ip machine address and <browser_type> by chrome or firefox:
     
    ```batch
    RUN ["mvn", "clean", "test", "-Dbrowser=<browser_type>", "-DlocalIpAddress=<your_local_ip_address>", "-Pviavarejo"]
    ```   
  
    And then run the following command:

    ```bash
    docker build -t test-via-varejo . && docker run test-via-varejo
    ```

- Results, dashboard and Live Preview:

    - [Grid Console URL](http://localhost:5555/grid/console)
    - [Zalenium Live Preview](http://localhost:5555/grid/admin/live?only_active_sessions=true&refresh=60)
    - [Zalenium Dashboard](http://localhost:5555/dashboard/)
    - [Report - Locally](http://localhost:63342/test-via-varejo-java/target/surefire-reports/html/index.html)

## Dependencies
- seleniumhq: 3.9.1
- testng: 7.1.0
- lombok: 1.18.12
- reportng: 1.2.2

## License
[MIT](https://choosealicense.com/licenses/mit/)  