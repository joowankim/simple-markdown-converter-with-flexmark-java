# MD File Viewer

## 개요

[whiteship-live-study](https://github.com/whiteship/live-study)를 진행하면서 13주차 과제인 I/O를 학습하면서 그냥 단순한 예제만 실행시켜 보는건 기억엔 별로 남을거 같지 않아서 잠깐의 기획으로 탄생한 프로젝트

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
