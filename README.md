<h1 align="center">Welcome to fever-api :fire: </h1>

<p align="center">
  <img src="./.images/fever-api.png" />
</p>

> Just a study using Quarkus for raspberry temperature monitoring

## Why ❓

> The idea is to use this project to study Quarkus and related technologies.

## Roadmap 🗺️
This is a summary of the project goals:

---
Basic structure
- [x]  Get the current temperature
- [x]  Create an object with the current temperature
- [x]  Get a list of previous temperatures
---

Deployment
- [x]  Adds deploy with docker
---

Database
- [x] Adds a real database, PostgreSQL or similar
---

Enhance the list endpoint
- [x]  Accept a date range as parameter
- [x]  Adapt a list of previous temperatures with a default range to prevent querying all database
---


## Related
- [🚒 fever-dashboard](https://github.com/C41949/fever-dashboard)

## Usage

Coding
```sh
quarkus dev
```

Deploy
```sh
make measure
```

## Author

👤 **Vinicius Kammradt**

* [Website](https://kammradt.now.sh)
* [Twitter](https://twitter.com/kammzinho)
* [Github](https://github.com/kammradt)
* [LinkedIn](https://linkedin.com/in/vinicius-kammradt)

## Show your support

Give a ⭐️ if this project helped you!

***
