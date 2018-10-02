(ns berlin-clock-kata.core-test
  (:require [clojure.test :refer :all]
            [berlin-clock-kata.core :refer :all]))

(deftest seconds_lamp_is_switched_on_on_even_seconds
  (testing "On even seconds, lamp is on"
    (is (= (seconds-lamp 2) true))))

(deftest seconds_lamp_is_switched_off_on_odd_seconds
  (testing "On odd seconds, lamp is off"
    (is (= (seconds-lamp 1) false))))

(deftest seconds_lamp_is_switched_on_on_zero
  (testing "On odd seconds, lamp is off"
    (is (= (seconds-lamp 0) true))))
