;
; Requirements:
;
; For an integer value n the generator should return all prime factors
; as an ordered list.
;

(ns kata.primefactors
	(:require [clojure.test :refer :all]))

(defn generate-primefactors
	"Generates the prime factors of a number."
	[n]
	(letfn [(divisible-by? [n d] (= 0 (mod n d)))]
		(loop [pf [] n n c 2]
			(cond (= n 1) pf
						(divisible-by? n c) (recur (conj pf c) (/ n c) c)
						:else (recur pf n (inc c))))))


(deftest test-generate-primefactors
	(testing "generation of prime factors for"
		(is (= (generate-primefactors 1) []))
		(is (= (generate-primefactors 2) [2]))
		(is (= (generate-primefactors 3) [3]))
		(is (= (generate-primefactors 4) [2 2]))
		(is (= (generate-primefactors 6) [2 3]))
		(is (= (generate-primefactors 9) [3 3]))))
