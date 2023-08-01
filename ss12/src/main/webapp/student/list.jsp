<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 7/28/2023
  Time: 09:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="https://cdn.datatables.net/1.13.5/css/dataTables.bootstrap5.min.css">
</head>
<body>
<button onclick="window.location.href='/students?action=create'" class="btn btn-primary">Thêm mới</button>
<h1>Danh sách học sinh</h1>
<table id="example" class="table table-hover">
    <thead>
    <tr>
        <th>Code</th>
        <th>Name</th>
        <th>Id card</th>
        <th>Point</th>
        <th>Rank</th>
        <th>Name Class</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${students == null}">
        <h1>Không có dữ liệu</h1>
    </c:if>
    <c:if test="${students != null}">
        <%--    for(Student student: students)--%>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.code}</td>
                <td>${student.nameStudent}</td>
                <td>${student.idCard}</td>
                <td>${student.point}</td>
                <td>
                    <c:if test="${student.point >8}">Good</c:if>
                    <c:if test="${student.point > 6 && student.point <= 8}">Normal</c:if>
                    <c:if test="${student.point < 6}">Bad</c:if>
                </td>
                <td>${student.nameClass}</td>
                <td>
                    <button type="button" class="btn btn-danger" onclick="showModal(${student.code})">
                        Delete
                    </button>

                        <%--                    <!-- Button trigger modal -->--%>
                        <%--                    <button type="button" class="btn btn-danger" data-bs-toggle="modal"--%>
                        <%--                            data-bs-target="#delete${student.code}">--%>
                        <%--                        Delete--%>
                        <%--                    </button>--%>

                        <%--                    <!-- Modal -->--%>
                        <%--                    <form method="post" action="/students?action=delete&code=${student.code}">--%>
                        <%--                        <div class="modal fade" id="delete${student.code}" tabindex="-1"--%>
                        <%--                             aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
                        <%--                            <div class="modal-dialog">--%>
                        <%--                                <div class="modal-content">--%>
                        <%--                                    <div class="modal-header">--%>
                        <%--                                        <h5 class="modal-title" id="exampleModalLabel">DELETE STUDENT</h5>--%>
                        <%--                                        <button type="button" class="btn-close" data-bs-dismiss="modal"--%>
                        <%--                                                aria-label="Close"></button>--%>
                        <%--                                    </div>--%>
                        <%--                                    <div class="modal-body">--%>
                        <%--                                        Bạn có muốn xóa học sinh có tên là ${student.nameStudent}?--%>
                        <%--                                    </div>--%>
                        <%--                                    <div class="modal-footer">--%>
                        <%--                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close--%>
                        <%--                                        </button>--%>
                        <%--                                        <button type="submit" class="btn btn-danger">Delete</button>--%>
                        <%--                                    </div>--%>
                        <%--                                </div>--%>
                        <%--                            </div>--%>
                        <%--                        </div>--%>
                        <%--                    </form>--%>
                </td>

            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>

<!-- Modal -->
<form action="/students?action=delete" method="post">
    <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">DELETE STUDENT</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <input type="hidden" name="code" id="code">
                <div class="modal-body">
                    Bạn có muốn xóa học sinh có code là <span id="codeStudentDelete"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
        crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.13.5/js/jquery.dataTables.min.js" ;></script>
<script src="https://cdn.datatables.net/1.13.5/js/dataTables.bootstrap5.min.js"></script>
<script>
    new DataTable('#example');
    function showModal(code) {
        document.getElementById("codeStudentDelete").innerText = code;
        document.getElementById("code").value = code;
        $("#deleteModal").modal("show");
    }
</script>
</html>
