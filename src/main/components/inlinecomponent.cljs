(ns components.inlinecomponent)


(def header {
              :color "blue" 
              :font-size "140px"
             }
  )


(defn inlinecomponent []
  [:div 
   ; [:h1 {:style header} "Inline Component"]
     [:h1.header "Inline Component"]
   ]
  )