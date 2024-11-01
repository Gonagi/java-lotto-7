# java-lotto-precourse

# 기능 요구 사항

## 간단한 로또 발매기를 구현한다.

- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
- 1등: 6개 번호 일치 / 2,000,000,000원
- 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
- 3등: 5개 번호 일치 / 1,500,000원
- 4등: 4개 번호 일치 / 50,000원
- 5등: 3개 번호 일치 / 5,000원
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
- 로또 1장의 가격은 1,000원이다.
- 당첨 번호와 보너스 번호를 입력받는다.
- 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
- Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

---

# 기능 목록

- 로또를 발행하는 기능
  - 숫자를 뽑는 기능
  - 뽑은 숫자를 검증하는 기능
    - 6개의 숫자를 뽑았는지 검증한다.
    - 뽑은 숫자 내 중복이 있는지 검증한다.
    - 뽑은 숫자의 범위가 1 ~ 45 인지 검증한다.
      - 숫자가 45 이하인지 검증한다.
      - 숫자가 1 이상인지 검증한다.
  - 뽑은 숫자를 오름차순으로 정렬한다.
- 당첨 번호를 입력하는 기능
  - 입력한 문자열을 검증하는 기능
    - null, 공백, 빈 문자열을 입력했는지 검증한다.
    - 숫자, ","외 다른 문자를 입력했는지 검증한다.
  - ","로 입력받은 문자열을 구분하는 기능
    - ","로 구분한 문자열이 6개인지 검증한다.
    - 구분한 문자열내 중복이 있는지 검증한다.
    - 구분한 문자열을 숫자로 변환한다.
    - 숫자의 범위가 1 ~ 45 인지 검증한다.
      - 숫자가 45 이하인지 검증한다.
      - 숫자가 1 이상인지 검증한다.
- 보너스 번호를 입력하는 기능

  - 입력한 문자열을 검증하는 기능
    - null, 공백, 빈 문자열을 입력했는지 검증한다.
    - 숫자를 입력했는지 검증한다.
    - 숫자의 범위가 1 ~ 45 인지 검증한다.
      - 숫자가 45 이하인지 검증한다.
      - 숫자가 1 이상인지 검증한다.

- 로또를 구입할 금액을 입력하는 기능

  - 입력한 문자열을 검증하는 기능
    - null, 공백, 빈 문자열을 입력했는지 검증한다.
    - 숫자를 입력했는지 검증한다.
  - 입력한 구입 금액을 검증한다.
    - 입력한 구입 금액이 1000원 단위로 떨어지는지 검증한다.

- 구입한 금액만큼 로또를 발행하는 기능

  - 구매할 로또 수를 계산하는 기능
  - 구매한 로또를 출력하는 기능

- 당첨 여부를 확인하는 기능

  - 구매한 로또랑 당첨 번호 사이 몇개가 일치하는지 확인하는 기능
  - 구매한 로또랑 보너스 번호 사이 몇개가 일치하는지 확인하는 기능
  - 당첨 내역을 출력하는 기능

- 수익률을 계산하는 기능
  - 수익의 합을 더하는 기능
  - 수익률은 소수점 둘째 자리에서 반올림한다.

---

## domain

### Lotto

- [x] 로또를 발행하는 기능 (Lotto)
  - 로또를 검증한다. (validate)
    - 로또 번호로 6개의 숫자로 이루어있는지 검증한다. (validateNumbersSize)
    - 로또 번호 내 중복이 있는지 검증한다. (validateDuplicateNumbers)

---

# 예외 목록

### Lotto

- 로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.
- 로또 번호에 중복된 숫자가 있으면 예외가 발생한다.
