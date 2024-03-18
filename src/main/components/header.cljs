(ns components.header)


(def header-css {
                 :background-color "#f7ca18"
                 :text-align "center"
                 :font-weight "bold"
                 :height "50px"
                 :padding "10px"
                 :font-size "2em"
                 :box-shadow "0 4px 6px rgba(0,0,0,0.2)"
                 }
  )

(defn header []
  [:div {:style header-css} "My Todo List"]
  )