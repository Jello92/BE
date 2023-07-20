![Thumbnail](https://github.com/Jello92/BE/assets/128972031/27c2dcbf-3f82-4c1c-aaa4-c69041e4d096)


# 🍻혼술짝 (HonSoolZZAK)
- 집에서 심심하고 쓸쓸하게 혼술은 그만! 편안하게 집에서 술짝 메이트 찾기!  


📆 프로젝트 기간
---------------------------------------
- 2023년 5월 19일 ~ 2023년 6월 30일


✨우리 팀을 소개합니다
---------------------------------------
| 역할 | 이름 | GitHub |
| ------ | -- | ----|
| Front-end | 배정현(L) | https://github.com/JungHBae|
| Front-end | 최성빈 | https://github.com/sbchoi5451|
| Front-end | 조선아 | https://github.com/princesssana| 
| Back-end | 지현경(VL)|  https://github.com/Jello92|
| Back-end | 김지현 | https://github.com/jihyeon117|
| Back-end | 김상우 | https://github.com/kimsangwoo0505|
| Designer | 곽준희 | |


🛠 Project Architecture
---------------------------------------
![아키텍쳐](https://github.com/soolzzak/BE/assets/128972031/d512fe9a-74fb-4f53-b4df-9bd7fdd44ea4)



📅 API 명세서
---------------------------------------
[혼술짝! RESTful API](https://fate-starfish-b23.notion.site/adfd01d3d12a465095c39b7e1a8f796a?v=c4c7b5d149e846bdb61357331bf241ed)



🗝 ERD 
---------------------------------------
![image](https://github.com/Jello92/BE/assets/128972031/8595f93e-c6a5-45e9-9a3f-4c5b392b2edb)




🛠 트러블 슈팅
---------------------------------------
<details>
<summary>동일 검색 쿼리를 검색했을 때 결과값을 새로 불러오지 않았던 문제</summary>

**`문제사항`**

검색 input으로 이전과 동일 검색어를 임력했을 때 값을 새로 불러오지 않음. 

**`해결방안`**

검색어가 atom으로 메인페이지 컴포넌트에 전달되어 값의 update가 있을 경우 useMutation으로 방 리스트 불러옴.

그러나 이전과 동일 값을 입력할 경우 값의 변화가 없기 때문에, trigger용 boolean atom을 만들어서 useEffect를 활용해 검색 성공

</details>
