(ns neonClojureTemplate.core
  (import 
    com.thomsonreuters.client.profile.impl.ProfileServiceClientImpl) 
  (:gen-class))

(def profileClient (ProfileServiceClientImpl.))


(def l (list 1 2 3 4 5))

(defn -main
 "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn print-test [phrase]
 (println phrase))

(defn parse-args  [args]
    (into  {}  (map  (fn  [[k v]]  [(keyword  (.replace k "--" "")) v])
                                    (partition 2 args))))
