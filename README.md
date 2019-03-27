# garmin-fit-clj

A Clojure library designed to decode garmin fit files.

## Usage

(require '[cnuernber/garmin-fit :as fit])

(fit/decode filename) ;;-> You get back a sequence of records from the file.

## License

Copyright © 2019 Chris Nuernberger

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
