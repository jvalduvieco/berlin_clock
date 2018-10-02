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

(deftest five_hour_row_has_first_light_on_at_1
  (testing "Five hour row has first light on at 1"
    (is (= (five_hour_row 1) [true false false false]))))
