# api-forty-winks

This is the backend for the forty winks app. Forty Winks enables users to purchase vouchers that can be redeemed at participating shelter accommodation for homeless people.

The production version is here: https://ui-forty-winks.herokuapp.com/.

The frontend ui repository can be found here: https://github.com/simon-norman/ui-forty-winks

## How to run

Clone this repo and perform `./gradlew build` command

### In development mode: `./gradlew bootRun`

Runs the app in the development mode.
The app starts on [http://localhost:8080].

Any edits to code will require a restart of the app.

Running dev instances of the front end will connect to a running dev backend instance

### To run tests, run `./gradlew test`

This will run all of the tests in command line.

## How to deploy

All Heroku deployments can be found in the Cookie Dough team site here: https://dashboard.heroku.com/teams/cookie-dough/apps.

We have two key branches, staging and master. We create branches for each feature from staging, and then merge to staging from each feature branch after each passing unit test. Once we have enough functionality for a release (e.g. a new feature as been added), we will push it to master via a pull request.

All merges and commits trigger a Codeship CI, which will also run the Cypress tests. Heroku will not deploy to production until the push to master passes CI.  

Merging / committing to staging will trigger a build to the Heroku test environment.

Merging / committing to master will trigger a build to the Heroku production environment.

## User stories / tickets / backlog

https://trello.com/b/pG7HmCwX/team-cookie-dough
