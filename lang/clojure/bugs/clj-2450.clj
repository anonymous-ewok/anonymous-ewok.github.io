(require '[clojure.spec.alpha :as s])
(require '[clojure.spec.test.alpha :as st])
(defmulti foo identity)
(s/fdef foo :args (s/cat :wat string?))
(defmethod foo :bar [lol])
(st/instrument)
(defmethod foo :baz [lol])