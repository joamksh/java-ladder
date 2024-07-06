리스트 이해하기

자바의 List 인터페이스와 그 구현체인 ArrayList와 LinkedList의 동작을 이해하고, SimpleList 인터페이스와 그 구현체(SimpleArrayList, SimpleLinkedList)를 직접 구현하여 학습한다.

주요 기능: ArrayList와 LinkedList의 기본 사용법 학습 및 SimpleList 인터페이스와 그 구현체 구현

List 인터페이스 이해

[x]SimpleList 인터페이스 구현

[ ]SimpleArrayList 구현
-내부적으로 동적 배열을 사용하여 SimpleList 인터페이스를 구현
배열의 크기를 동적으로 조절하는 로직을 포함

[ ]SimpleLinkedList 구현
-내부적으로 단일 연결 리스트를 사용하여 SimpleList 인터페이스를 구현

[ ]테스트 작성
ArrayList와 LinkedList의 주요 기능을 테스트하는 코드를 작성
SimpleArrayList와 SimpleLinkedList에 대해 동일한 테스트 코드를 작성하여 올바르게 동작하는지 확인
