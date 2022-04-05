// WebServlet 생성 방법
1) 클래스 생성
2) HttpServlet 상속하기
   예)  public class RequestBodyJsonServlet extends HttpServlet { }
3) service메쏘드 Override하기
   예) public class RequestBodyJsonServlet extends HttpServlet {
          @Override
            protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                //super.service(req, resp);
            }
        }
4) @WebServlet 어노테이션 정의
   예) @WebServlet(name = "requestBodyJsonServlet", urlPatterns = "/request-body-json")
      public class RequestBodyJsonServlet extends HttpServlet {
          @Override
          protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              //super.service(req, resp);
          }
      }

// 변수 추가 단축키 예 (ctrl+alt+v)
1) request.getInputStream();  Typing후에 단축키(ctrl+alt+v)입력
2) ServletInputStream inputStream = request.getInputStream();

// print 단축키 : soutv
1) String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8); Typing후에 단축키(soutv)입력
2) System.out.println("messageBody = " + messageBody);

// import class 단축키 : alt+shift+enter
Cookie cookie = new Cookie("myCookie", "good");