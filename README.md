### Cors và csrf trong springboot là gì
CORS (Cross-Origin Resource Sharing) và CSRF (Cross-Site Request Forgery) là hai vấn đề liên quan đến bảo mật web và thường được xử lý trong Spring Boot.

CORS là một cơ chế bảo mật của trình duyệt để ngăn chặn các trang web khác miền (cross-origin) truy cập tài nguyên từ trang web của bạn. Trong Spring Boot, CORS được xử lý bằng cách thêm các tiêu đề phản hồi (response headers) để cho phép hoặc từ chối các yêu cầu từ các nguồn khác nhau. Điều này giúp đảm bảo rằng tài nguyên trên trang web của bạn chỉ được truy cập từ các trang web được ủy quyền.

CSRF là một kỹ thuật tấn công bảo mật trong đó tin tặc khai thác quyền chứng thực của người dùng để thực hiện các hành động không mong muốn trên trang web của họ. Để ngăn chặn các cuộc tấn công CSRF, Spring Boot cung cấp bộ lọc CSRF mặc định bằng cách sử dụng mã thông báo (token) chứng thực cho các yêu cầu đến trang web của bạn. Mã thông báo này sẽ được tạo ra và gửi cho người dùng khi họ đăng nhập vào trang web của bạn, và sẽ được yêu cầu trong mỗi yêu cầu sau đó để đảm bảo rằng yêu cầu đó được gửi từ người dùng đúng và không phải từ một tấn công CSRF.

Trong tổng quan, CORS và CSRF đều là các kỹ thuật bảo mật quan trọng của web, và Spring Boot cung cấp các công cụ để giúp bạn xử lý chúng và bảo vệ trang web của bạn khỏi các cuộc tấn công bảo mật.





### http.csrf().disable() để làm gì
http.csrf().disable() là một phương thức của Spring Security được sử dụng để tắt bảo vệ CSRF cho ứng dụng web của bạn. CSRF là một kỹ thuật tấn công bảo mật trong đó tin tặc khai thác quyền chứng thực của người dùng để thực hiện các hành động không mong muốn trên trang web của họ. Để ngăn chặn các cuộc tấn công CSRF, Spring Security cung cấp một bộ lọc CSRF mặc định bằng cách sử dụng mã thông báo (token) chứng thực cho các yêu cầu đến trang web của bạn.

Tuy nhiên, trong một số trường hợp đặc biệt, bạn có thể muốn tắt bảo vệ CSRF cho một số yêu cầu nhất định hoặc cho toàn bộ ứng dụng của bạn. Ví dụ, nếu ứng dụng của bạn đã được bảo vệ bởi một cơ chế chứng thực khác và bạn không muốn sử dụng bộ lọc CSRF của Spring Security. Trong trường hợp này, bạn có thể sử dụng phương thức http.csrf().disable() để tắt bảo vệ CSRF cho toàn bộ ứng dụng.

Tuy nhiên, khi bạn tắt bảo vệ CSRF, ứng dụng của bạn sẽ trở nên dễ bị tấn công hơn. Vì vậy, nếu bạn không có lý do cụ thể để tắt bảo vệ CSRF, bạn nên giữ nó bật để đảm bảo an toàn cho ứng dụng của bạn.





### http.cors().disable() la gì
http.cors().disable() là một phương thức của Spring Security được sử dụng để tắt bảo vệ CORS cho ứng dụng web của bạn. CORS (Cross-Origin Resource Sharing) là một cơ chế bảo mật của trình duyệt để ngăn chặn các trang web khác miền (cross-origin) truy cập tài nguyên từ trang web của bạn. Tuy nhiên, trong một số trường hợp đặc biệt, bạn có thể muốn tắt bảo vệ CORS cho một số yêu cầu nhất định hoặc cho toàn bộ ứng dụng của bạn.

Ví dụ, nếu bạn muốn cho phép các trang web khác miền truy cập tài nguyên từ ứng dụng của bạn mà không bị chặn bởi chính sách CORS của trình duyệt, bạn có thể sử dụng phương thức http.cors().disable(). Tuy nhiên, khi bạn tắt bảo vệ CORS, ứng dụng của bạn có thể trở nên dễ bị tấn công hơn, vì các trang web khác miền có thể truy cập vào tài nguyên của bạn. Do đó, nếu không có lý do cụ thể để tắt bảo vệ CORS, bạn nên giữ nó bật để đảm bảo an toàn cho ứng dụng của bạn.







### http.csrf() nó sẽ chặn những request nào
Phương thức http.csrf() trong Spring Security được sử dụng để bật bảo vệ CSRF (Cross-Site Request Forgery) trong ứng dụng web của bạn. CSRF là một kỹ thuật tấn công web bằng cách tạo ra các yêu cầu giả mạo bằng cách sử dụng các thông tin đăng nhập và phiên của người dùng đã được xác thực.

Khi bạn sử dụng phương thức http.csrf(), nó sẽ mặc định chặn tất cả các yêu cầu HTTP trừ khi chúng được bảo vệ bằng CSRF token. Điều này có nghĩa là, tất cả các yêu cầu POST, PUT, DELETE và PATCH sẽ bị từ chối bởi Spring Security nếu chúng không chứa CSRF token trong yêu cầu của mình.

Tuy nhiên, đôi khi bạn muốn vô hiệu hóa bảo vệ CSRF trong một số trường hợp đặc biệt. Điều này có thể xảy ra khi bạn đã bảo vệ ứng dụng của mình bằng các phương pháp khác, chẳng hạn như JWT (JSON Web Token) hoặc OAuth2. Trong trường hợp này, bạn có thể sử dụng phương thức http.csrf().disable() để vô hiệu hóa bảo vệ CSRF. Tuy nhiên, điều này sẽ làm giảm tính bảo mật của ứng dụng của bạn và nên được sử dụng cẩn thận.







### lợi ích của webflux
WebFlux là một trong những framework của Spring được thiết kế để xây dựng các ứng dụng web theo mô hình reactive, tận dụng tối đa các ưu điểm của reactive programming để cung cấp hiệu suất và khả năng mở rộng tốt hơn.

Một số lợi ích của WebFlux bao gồm:

Hiệu suất cao: WebFlux cung cấp cho chúng ta một cách tiếp cận hoàn toàn khác để xử lý các yêu cầu web. Thay vì sử dụng mô hình blocking IO, WebFlux sử dụng các APIs reactive để tạo ra các ứng dụng hoạt động theo cách không chặn (non-blocking) và sử dụng ít tài nguyên hơn, giúp tăng hiệu suất và độ tin cậy của ứng dụng.

Khả năng mở rộng: WebFlux cho phép xây dựng các ứng dụng web mở rộng tốt hơn. Với các ứng dụng có thể nhận được hàng ngàn yêu cầu trên giây, việc sử dụng các APIs reactive có thể giảm đáng kể tài nguyên máy chủ cần thiết và giúp cho ứng dụng có thể xử lý được nhiều yêu cầu hơn.

Tương thích với các dịch vụ đám mây: Các dịch vụ đám mây như Amazon Web Services, Microsoft Azure, Google Cloud Platform đều hỗ trợ các công nghệ reactive như WebFlux. Vì vậy, việc sử dụng WebFlux giúp cho ứng dụng của bạn có thể dễ dàng triển khai và chạy trên các nền tảng đám mây này.

Có thể kết hợp với Spring MVC: WebFlux không hoàn toàn thay thế cho Spring MVC. Thực tế, các ứng dụng có thể sử dụng cả hai framework này trong một ứng dụng. Việc kết hợp giữa WebFlux và Spring MVC có thể giúp cho các ứng dụng có thể tận dụng được tối đa các ưu điểm của cả hai framework, giúp cho việc phát triển ứng dụng trở nên dễ dàng hơn.




### webflux và rest api
WebFlux là một trong những framework của Spring được thiết kế để xây dựng các ứng dụng web theo mô hình reactive. Một trong những cách sử dụng phổ biến của WebFlux là để xây dựng các RESTful API.

RESTful API là một kiểu thiết kế ứng dụng web được sử dụng rộng rãi trong các ứng dụng hiện đại. RESTful API cho phép các ứng dụng có thể truy cập và thao tác với các tài nguyên (resource) trên máy chủ thông qua các phương thức HTTP như GET, POST, PUT, DELETE.

WebFlux cho phép xây dựng các RESTful API theo mô hình reactive, sử dụng các APIs reactive để tạo ra các ứng dụng hoạt động theo cách không chặn (non-blocking) và sử dụng ít tài nguyên hơn. Điều này giúp cho các ứng dụng có thể xử lý được nhiều yêu cầu hơn và tăng hiệu suất.

Các RESTful API xây dựng bằng WebFlux sử dụng các annotations của Spring như @RestController, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping để khai báo các phương thức xử lý các yêu cầu HTTP từ phía client.

Với WebFlux, bạn có thể xử lý các yêu cầu RESTful API một cách đồng thời và có khả năng mở rộng tốt hơn so với các ứng dụng xử lý yêu cầu theo mô hình blocking IO. Vì vậy, WebFlux là một trong những lựa chọn tốt cho việc xây dựng các RESTful API hiệu suất cao và có khả năng mở rộng.





### blocking IO
Blocking IO là một cách thức xử lý IO (input/output) trong lập trình mà một tiến trình (thread) sẽ bị chặn (block) khi đang thực hiện một hoạt động IO (ví dụ: đọc/ghi file, đọc/ghi từ socket). Trong khi tiến trình đang chờ IO được hoàn thành, nó sẽ không thể thực hiện bất kỳ hoạt động nào khác. Nếu tiến trình chính bị chặn bởi hoạt động IO, thì toàn bộ ứng dụng cũng bị chặn và không thể phản hồi yêu cầu từ phía client.

Trong mô hình blocking IO, để xử lý nhiều yêu cầu từ nhiều client cùng lúc, ta cần tạo ra nhiều tiến trình (thread) để xử lý các yêu cầu đó. Tuy nhiên, với số lượng client và yêu cầu lớn, việc tạo ra quá nhiều thread sẽ dẫn đến tình trạng chiếm nhiều tài nguyên hệ thống và gây ra hiện tượng đình trệ (deadlock) và nghẽn (congestion).

Do đó, để giải quyết các vấn đề trên, người ta đã tìm ra các giải pháp khác như sử dụng các phương pháp xử lý không chặn (non-blocking) như event-driven IO hay sử dụng mô hình reactive programming.





### non-blockingIO
Non-blocking IO là một cách thức xử lý IO (input/output) trong lập trình mà các tiến trình (threads) không bị chặn (block) khi đang thực hiện một hoạt động IO (ví dụ: đọc/ghi file, đọc/ghi từ socket). Thay vào đó, các tiến trình có thể tiếp tục thực hiện các hoạt động khác trong khi đang chờ IO hoàn thành.

Trong mô hình non-blocking IO, một tiến trình có thể xử lý nhiều yêu cầu từ nhiều client cùng lúc. Khi một yêu cầu IO được gửi đến, tiến trình sẽ đăng ký yêu cầu đó và tiếp tục thực hiện các yêu cầu khác. Khi hoạt động IO được hoàn thành, tiến trình sẽ nhận được thông báo và xử lý kết quả.

Vì các tiến trình không bị chặn khi thực hiện IO, nên mô hình non-blocking IO giúp giảm thiểu tình trạng chiếm nhiều tài nguyên hệ thống, tăng hiệu suất và cải thiện khả năng mở rộng của ứng dụng.

Một số framework và thư viện hỗ trợ non-blocking IO trong Java bao gồm Netty, Spring WebFlux, Akka và Vert.x.





### R2DBC la gi
R2DBC (Reactive Relational Database Connectivity) là một tiêu chuẩn kết nối cơ sở dữ liệu quan hệ (relational database) trong Java hỗ trợ xử lý không chặn (non-blocking) và theo phong cách lập trình reactive. Nó cho phép các ứng dụng sử dụng cơ sở dữ liệu quan hệ sử dụng các khả năng reactive của Spring Framework như đường ống (stream) và bộ thu (subscriber).

R2DBC có thể được sử dụng để kết nối đến các cơ sở dữ liệu quan hệ như MySQL, PostgreSQL, Oracle và SQL Server. Nó hỗ trợ các tính năng như pooling kết nối, transaction management và async query execution.

R2DBC là một phần của dự án Spring Data R2DBC, cung cấp tích hợp Spring Data với các cơ sở dữ liệu quan hệ sử dụng R2DBC. Việc sử dụng R2DBC có thể giúp cải thiện hiệu suất và khả năng mở rộng của ứng dụng, đặc biệt là trong các trường hợp có nhiều yêu cầu cùng lúc.





### Flux và Mono
Flux và Mono là hai lớp cốt lõi trong Reactive Streams API của Spring Framework, đại diện cho dữ liệu tuần tự và bất đồng bộ.

Flux là một lớp đại diện cho một chuỗi dữ liệu tuần tự (sequence) gồm nhiều phần tử, nó hoạt động giống như một Stream trong Java. Flux cho phép bạn xử lý dữ liệu một cách bất đồng bộ, theo kiểu push-based, khi các phần tử sẽ được phát ra từng phần một, mỗi khi có sẵn.

Mono là một lớp đại diện cho một giá trị bất đồng bộ duy nhất (asynchronous single value), nó cho phép bạn xử lý một giá trị duy nhất hoặc một lỗi một cách bất đồng bộ. Mono hoạt động giống như một CompletableFuture trong Java, nhưng với khả năng xử lý bất đồng bộ.

Cả Flux và Mono đều cung cấp các phương thức để xử lý các phần tử hoặc giá trị bất đồng bộ, bao gồm phương thức filter(), map(), flatMap(), zip() và nhiều hơn nữa. Sử dụng Flux và Mono có thể giúp bạn tận dụng tối đa các tính năng reactive và bất đồng bộ trong Spring Framework, đặc biệt là trong các trường hợp cần xử lý đồng thời nhiều yêu cầu từ nhiều nguồn khác nhau.










### webflux r2dbc
WebFlux và R2DBC là hai công nghệ của Spring được sử dụng để xây dựng ứng dụng Reactive.

WebFlux là một framework web Reactive cho phép bạn xây dựng ứng dụng web Reactive sử dụng các API như Flux và Mono. WebFlux cho phép xử lý các yêu cầu một cách không đồng bộ, giúp tăng hiệu suất và khả năng mở rộng của ứng dụng.

R2DBC là một phiên bản Reactive của JDBC, cho phép bạn tương tác với cơ sở dữ liệu một cách không đồng bộ. R2DBC cho phép bạn sử dụng Flux và Mono để truy vấn và xử lý dữ liệu trong cơ sở dữ liệu một cách Reactive, giúp giảm thiểu thời gian chờ đợi và tăng khả năng mở rộng của ứng dụng.

Sử dụng WebFlux và R2DBC trong ứng dụng Spring Boot giúp bạn xây dựng các ứng dụng Reactive với tốc độ xử lý cao, khả năng mở rộng tốt và khả năng đáp ứng yêu cầu cao của người dùng. Điều này đặc biệt hữu ích cho các ứng dụng có lưu lượng truy cập cao hoặc cần xử lý các tác vụ nặng.




### webclient
WebClient là một công cụ của Spring WebFlux, cung cấp một cách tiếp cận Reactive để gửi và nhận các yêu cầu HTTP. WebClient cho phép xây dựng các ứng dụng web Reactive với tốc độ xử lý cao và khả năng mở rộng tốt.

WebClient hỗ trợ các định dạng dữ liệu như JSON, XML và text, và cung cấp các phương thức để gửi các yêu cầu HTTP như GET, POST, PUT, DELETE và PATCH. WebClient cũng hỗ trợ Reactive Streams, cho phép xử lý dữ liệu một cách không đồng bộ và tiết kiệm tài nguyên.

Để sử dụng WebClient trong ứng dụng Spring Boot, bạn cần thêm thư viện spring-webflux vào file pom.xml của dự án. Sau đó, bạn có thể sử dụng WebClient để gửi và nhận các yêu cầu HTTP bằng cách tạo một đối tượng WebClient và gọi các phương thức của nó.

Ví dụ, để gửi một yêu cầu GET đến một API, bạn có thể sử dụng mã như sau:

``java
WebClient client = WebClient.create();
Mono<String> result = client.get()
.uri("https://example.com/api")
.retrieve()
.bodyToMono(String.class);
``

Trong đó, đối tượng client được tạo bằng cách gọi phương thức static WebClient.create(). Sau đó, phương thức get() được gọi để chỉ định yêu cầu GET và uri() được sử dụng để chỉ định URI của API. Cuối cùng, phương thức retrieve() được gọi để thực hiện yêu cầu và phương thức bodyToMono() được sử dụng để chuyển đổi kết quả thành một đối tượng Mono<String>.