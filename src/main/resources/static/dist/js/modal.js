$( document ).ready(function(){
        console.log("***************");
        // START modal validation
        $("#roleForm").validate({
            rules: {
                roleName: {
                    required: true
                }
            },
            messages: {
                roleName: "Please enter role name"
            }
        });
        // END modal validation

        // START role edit
        $(".table .edit-btn").click(function() {
            var adminTypeId = $(this).attr('name');
            $.ajax({
				type: 'GET',
				url: 'role/edit',
                data: { id: adminTypeId}
			}).done(function(data){
			    $('#roleForm #roleId').attr('value',data.role_id);
			    $('#roleForm #roleName').attr('value',data.role_name);
			    $('#roleForm #roleLevel').attr('value',data.role_level);
			    $("#roleModal").modal('show');
			});
        });
        // END Role Edit

        // START Role reset
        $('#roleModal').on('hidden.bs.modal', function () {
            $('#roleForm #roleId').attr('value', '');
            $('#roleForm #roleName').attr('value', '');
            $('#roleForm #roleLevel').attr('value','');
        })
        // END of Role reset
    });