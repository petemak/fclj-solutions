(ns fclj.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


;; 4
(= (list :a :b :c) '(:a :b :c))

;; 5
(= '(1 2 3 4) (conj '(2 3 4) 1))
