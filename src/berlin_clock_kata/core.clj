(ns berlin-clock-kata.core)

(defn seconds-lamp
  "Returns true when light must be on"
  [seconds]
  (even? seconds))
