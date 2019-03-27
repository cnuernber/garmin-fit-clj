(ns cnuernber.garmin-fit-test
  (:require [cnuernber.garmin-fit :as fit]
            [clojure.test :refer :all]))


(deftest load-test-data
  (let [file-records (fit/decode "test/data/81623728.fit.gz")]
    (is (= 8671
           (count file-records)))))
