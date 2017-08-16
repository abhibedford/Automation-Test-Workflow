@rem ##########################################################################
@rem
@rem  Handling proxy tunneling error while using the gradle wrapper for the first time.
@rem
@rem ##########################################################################

gradlew -Djdk.http.auth.tunneling.disabledSchemes=”” -Djdk.http.auth.proxying.disabledSchemes=””
