;; create the main project namespace
(ns modern-cljs.core
  (:require [modern-cljs.login]))

;; enable cljs to print to the JS console of the browser
(enable-console-print!)

;; print to the console
(println "Hello, World!")

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
