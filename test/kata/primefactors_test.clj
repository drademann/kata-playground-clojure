(ns kata.primefactors-test
	(:require [clojure.test :refer :all]
						[kata.primefactors :refer :all]))

(deftest test-generate-primefactors
	(testing "generation of prime factors for"
		(is (= (generate-primefactors 1) '()) "number 1 returns empty list")))
