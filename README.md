# garmin-fit-clj

[![Clojars Project](https://img.shields.io/clojars/v/cnuernber/garmin-fit-clj.svg)](https://clojars.org/cnuernber/garmin-fit-clj)

A Clojure library designed to decode garmin fit files.

## Usage

```clojure

(require '[cnuernber/garmin-fit :as fit])

(fit/decode filename) ;;-> You get back a sequence of records from the file.

```

## License

Copyright © 2019 Chris Nuernberger

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
