(ns kata.primefactors)

(defn divisible?
  "Returns true if n is divisible by c."
  [n d]
  (= 0 (mod n d)))

(defn generate-primefactors
  "Generates the prime factors of a number."
  [n]
  (loop [pf [] n n c 2]
    (cond (= n 1) pf
          (divisible? n c) (recur (conj pf c) (/ n c) c)
          :else (recur pf n (inc c)))))