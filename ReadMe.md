# MD File Viewer

## 개요

[whiteship-live-study](https://github.com/whiteship/live-study)를 진행하면서 13주차 과제인 I/O를 학습하면서 I/O 연습을 지금 같이 공부하고 있는 스프링이나 코틀린과 같이 써볼 수 없을까 생각하다가 탄생한 프로젝트

## 프로젝트 실행 방법

```shell
# at windows
$ git clone https://github.com/kjw217/simple-markdown-converter-with-flexmark-java.git
$ ./gradlew bootRun
```

## 사용법

1. `.md` 파일을 작성한다.
2. `http://localhost:8080`에 업로드한다.

## 동작 원리

1. 사용자가 업로드한 `.md` 파일을 업로드 한다.
2. 업로드 된 `.md` 파일을 `flexmark-java` 라이브러리를 활용해 `.html` 파일로 변환한다.
3. 변환된 `.html` 파일을 브라우저로 반환해 보여준다.

## 느낀점

`FileReader`와 `FileOutput`을 사용하긴 했지만 channel이나 buffer도 사용할 수는 있을거 같다고 생각했다.
하지만 변환하는게 주요 목적인 어플리케이션이라 I/O를 메인으로 쓰지는 못한 것 같다.
I/O를 공부하기 위해서는 대량의 데이터를 다루는 데이터 분석 쪽 어플리케이션으로 기획을 했으면 좀 더 I/O를 제대로 사용할 수 있었으리라고 생각했다.
