(ns core
  (:require 
   [reagent.dom :as rdom]
   [components.todo :refer [todo]] 
   [components.inlinecomponent :refer [inlinecomponent]]
   [components.header :refer [header]]
   )
  )



(defn app []
  [:div 
    [header]
    [todo]
   ]
  
 ; [inlinecomponent]
  )

(defn ^:dev/after-load start []
  (rdom/render [app] (js/document.getElementById "app")))


;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))


(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start)
  )

;(main)