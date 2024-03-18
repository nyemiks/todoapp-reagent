(ns components.form
  (:require [reagent.core :refer [atom]])
  )

(def item (atom {:name "", :done false}))


(defn- handle-submit [e items]
  
  (.preventDefault e)
    
    (swap! items conj @item)
  
    (reset! item {:name "", :done false})
  
    (.info js/console "items: " @items)
  )



(defn form [items]
  (fn [items]
      [:form {
              :class "todoform"
              :on-submit #(handle-submit %1 items)
              }
         [:div  {
                 :class "inputContainer"
                 } 
             [:input {
                      :class "modernInput"
                      :placeholder "Enter todo item"
                      :value (:name @item)
                      :on-change (fn [e]
                                (reset! item {:name (.. e -target -value) :done false})
                                )
                  }
             ]
             [:button {
                       :class "modernButton"
                       :type "submit"
                       } "Add"]          
          ]         
       ]
      )
  )