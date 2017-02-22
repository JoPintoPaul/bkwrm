package bkwrm.domain

case class Book(author: Author, title: String, bookType: BookType)

case class Author(firstName: String, lastName: String)

sealed trait BookType
case object Fiction extends BookType
case object NonFiction extends BookType