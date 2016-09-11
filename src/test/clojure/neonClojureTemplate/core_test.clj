(ns neonClojureTemplate.core_test
  (:gen-class)
  (use clojure.test)
  (use neonClojureTemplate.core))

(deftest pairs-of-values
  (let  [args  ["--server" "localhost"
                "--port" "59617"
                "--environment" "localDev"]]
    ;;; hardcoded map is equal to the result of parse-args
             (is  (=  {:server "localhost"
                       :port "59617"
                       :environment "localDev"}
  (parse-args args)))))

(deftest l-size
  ;;; the list l defined in core.clj has size = 5
  (is (= 5 (count l)))
  )
