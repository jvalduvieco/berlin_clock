(ns berlin-clock-kata.core)

(defn seconds-lamp
  "Returns true when light must be on"
  [seconds]
  (even? seconds))

(defn five_hour_row
  "presents 5 hour blocks and is made up of 4 red lamps"
  [hours]
  (let [modulo (mod hours 5) ]
    [(concat (repeat modulo true) (repeat (- 4 modulo) false)) ])
  )
