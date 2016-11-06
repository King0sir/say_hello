package bobrocckets{
  package navigation{
    private[bobrocckets] class Navigator{
      protected[navigation] def userStarChart(){}
      class LegOfJourney{
        private[Navigator] var distance = 100
      }
      private[this] var speed = 200
    }
  }
  package launch{
    import navigation._
    object Vehicle{
      private[launch] val guide = new Navigator
    }
  }
}