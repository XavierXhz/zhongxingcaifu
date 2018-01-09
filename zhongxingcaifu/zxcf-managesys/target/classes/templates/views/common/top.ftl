<div class="navbar cm-navbar">
	<img class="logo" alt="Brand" src="${base}/images/logo.png">
	<span class="pageTitle">&nbsp;</span>
	<ul class="nav navbar-nav navbar-right cm-navbar-nav">
		<li>
			<p class="navbar-text text-info">
				<#if logininfo??>${logininfo.username}
					<#else>
					<script>
						window.location.href = "/";
					</script>
				</#if>
			</p>
		</li>
		<li><a href="">安全退出</a></li>
		<li><a href="">个人设置</a></li>
	</ul>
</div>