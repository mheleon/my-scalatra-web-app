# My Scalatra Web App #

## Build & Run ##

```sh
$ cd my-scalatra-web-app
$ sbt
> jetty:start
> browse
```

To recompile and reload the application automatically, run the following:
```
> ~;jetty:stop;jetty:start
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.
