(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "ericcasts"]
  (include-css "/stylesheets/ericcasts.css")
  (include-js "/javascript/ericcasts.js")]
 [:body
  (eval (:template-body gaeshi.views/*view-context*))
]]