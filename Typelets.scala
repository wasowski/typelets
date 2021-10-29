package typelets

enum Gender:
  case Male extends Gender
  case Female extends Gender

trait T (
  name: String,
  address: String,
  age: Int,
  gender: Gender,
  passedCourse: Boolean
)
